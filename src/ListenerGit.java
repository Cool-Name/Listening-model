import org.eclipse.jgit.api.*;

/*
 * Specifies the allowed actions on a server explicitly listening
 */
public class ListenerGit
{
	public static boolean clone(String repoURL)
	{
		File dire = new File(DeployServer.getEnvironmentLabel());
		try{
			Git result = Git.cloneRepository()
                		.setURI(repoURL)
                		.setDirectory(dire)
				.call();
			result.close();
			return true;
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public static boolean pull(String repo)
	{
		
	}
	
	public static boolean pull(String[] repos)
	{
		
	}
}
