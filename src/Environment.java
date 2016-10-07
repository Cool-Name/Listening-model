import java.util.*;

public class Environment
{
	private String label;
	private ArrayList<Role> roles;
	private Date creationDate;
	private Date mostRecentChange;

	public Environment(String label, ArrayList<Role> roles)
	{
		this.label = label;
		this.roles = roles;

		Date curr =  new Date();

		creationDate = curr;
		mostRecentChange = curr;
	}

	public getLabel()
	{
		return label;
	}
	public ArrayList<Role> getRoles()
	{
		return roles;	
	}
	public getcreationDate()
	{
		return creationDate;
	}
	public getMostRecentChange()
	{
		return mostRecentChange;
	}
	public setMostRecentChange(Date newDate)
	{
		this.mostRecentChange = newDate;
	}
}
