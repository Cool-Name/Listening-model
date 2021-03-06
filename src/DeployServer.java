import java.util.*;
import java.io.*;

public class DeployServer
{
	private static Environment currEnvironment;
	
	public Environment getEnvironment()
	{
		return currEnvironment;
	}
	public Environment setEnvironment(Environment newEnv)
	{
		this.currEnvironment = newEnv;
	}

	public String getEnvironmentLabel()
	{
		return currEnvironment.getLabel();
	}
}
