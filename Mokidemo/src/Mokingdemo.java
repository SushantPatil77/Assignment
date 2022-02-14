import org.mockito.Mockito;
import org.junit.Before;
public class Mokingdemo {
	 EmployeeService employeeService;
	    @Before
	    public void setUp() {
	        employeeService = Mockito.mock(EmployeeService.class);
	        EmployeeManager employeeManager = new EmployeeManager();
	        employeeManager.setEmployeeService(employeeService);
	    }
}
