
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 730676
 */
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp")
                .forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
        String input = request.getParameter("age");
        
        if(input.length() == 0){
            request.setAttribute("message", "You must give your current age.");
            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp")
                .forward(request, response);
            return;
        }
        
        boolean num = true;
        int ageNumber;
        
	for(int i = 0; i < input.length(); i++) {
            if(!Character.isDigit(input.charAt(i))) {
		num = false;
		request.setAttribute("message", "You must enter a number.");
		getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp")
                .forward(request, response);
                return;
            }
        }
        if(num) {
            ageNumber = Integer.parseInt(input);
            if (ageNumber >= 0) {
                
                ageNumber++;
                
                request.setAttribute("message", "Your age next birthday will be " + ageNumber);
		getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp")
                .forward(request, response);
                return;
            }
        }
    }
}
        
        
