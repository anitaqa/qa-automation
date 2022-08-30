package elements;

import org.openqa.selenium.By;

public class Elements {
	
	
	//us1
	public By email = By.xpath("//*[@id='user_email']");
	public By password = By.xpath("//*[@id='user_password']");
	public By btnSignin = By.xpath("//input[@name='commit']");
	public By myTasks = By.xpath("//*[@id='my_task']");
	public By newTask = By.xpath("//*[@id='new_task']");
	public By addButton = By.xpath("//*[@class='input-group-addon glyphicon glyphicon-plus']");
	public By taskList = By.xpath("//tbody/tr[1]/td[2]/a[contains(text(), 'Test')]");

	//us2
	public By subTask1 = By.xpath("//body/div[4]/div/div/div[1]/h3");
	public By subTask2 = By.xpath("//tbody/tr[2]/td[4]/*");
	public By subTask3 = By.xpath("//tbody/tr[3]/td[4]/*");
	public By subTaskDesc = By.xpath("//input[@id='new_sub_task']");
	public By subTaskID = By.xpath("//h3[contains(text(), 'Editing task')]");
	public By dueDate = By.xpath("//input[@id='dueDate']");
	public By addButton2 = By.xpath("//*[@id='add-subtask']");
	public By appendedSubTask = By.xpath("//tbody/tr[1]/td[2]/*");
}
