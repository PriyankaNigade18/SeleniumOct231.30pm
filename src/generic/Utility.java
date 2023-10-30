package generic;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utility 
{
	
	public static void selectBasedDropdown(WebElement ele,String value)
	{
		      //select class
				Select dd=new Select(ele);
				System.out.println("Is dropdown support multiple selection?: "+dd.isMultiple());
				
				//all options
				List<WebElement> allOptions=dd.getOptions();
				System.out.println("Total options are: "+allOptions.size());
				
				for(WebElement i:allOptions)
				{
					System.out.println(i.getText());
					if(i.getText().contains(value))
					{
						i.click();
						break;
					}
				}
				
				
	}
	

}
