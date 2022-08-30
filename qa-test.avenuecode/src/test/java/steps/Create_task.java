package steps;

import elements.Elements;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import methods.Methods;
import runner.Execute;

public class Create_task {
	
	Methods methods = new Methods();
	Elements el = new Elements();
	
	@Given("user is in {string}")
	public void user_is_in(String string) {
		Execute.openBrowser();

	}

	@Given("entered email And password")
	public void entered_email_and_password() {
		methods.type(el.email, "anitapcamara@gmail.com");
		methods.type(el.password, "assessmentqa");
		methods.click(el.btnSignin);

	}

	@Given("user is redirect to page tasks")
	public void user_is_redirect_to_page_tasks() {
			methods.click(el.myTasks);

	}

	@When("user can type new task And press enter or click on add task button")
	public void user_can_type_new_task_and_press_enter_or_click_on_add_task_button() {
		methods.type(el.newTask, "Test typing new Tasks");
		methods.click(el.addButton);

	}

	@Then("new tasked is added succefully")
	public void new_tasked_is_added_succefully() {
		methods.validateText(el.taskList, "Test");
		methods.screenShot("CT01 - Fill Form");

	}

}
