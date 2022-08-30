package steps;

import elements.Elements;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import methods.Methods;
import runner.Execute;

public class Create_subtask {
	
	
	Methods methods = new Methods();
	Elements el = new Elements();
	
	@Before
	public void runTest() {
		Execute.openBrowser();
		methods.type(el.email, "anitapcamara@gmail.com");
		methods.type(el.password, "assessmentqa");
		methods.click(el.btnSignin);
		
	}
	
	
	@Given("user is {string}")
	public void user_is(String string) {
		methods.click(el.myTasks);
		

	}

	@Given("click on manage subtask button")
	public void click_on_manage_subtask_button() {
		methods.click(el.subTask1);
		
	}

	@Given("system opens modal dialog with Task ID")
	public void system_opens_modal_dialog_with_task_id() {
		sss

	}

	@When("type Sub task description")
	public void type_sub_task_description() {
		methods.type(el.subTaskDesc, "Test typing SubTasks");

	}

	@When("type due date And click on Add button")
	public void type_due_date_and_click_on_add_button() {
		methods.type(el.dueDate, "08/30/2022");

	}

	@Then("subtask added successfully")
	public void subtask_added_successfully() {
		methods.click(el.addButton2);

	}


}
