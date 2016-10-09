import java.io.File;

import org.eclipse.jgit.api.Git;

/*
 * Specifies the allowed actions on a server explicitly listening
 */
public class ListenerGit
{
	public static boolean clone(String repoURL, DeployServer serv)
	{
		File dire = new File(serv.getEnvironmentLabel());
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
		return false;
		
	}
	
	public static boolean pull(String[] repos)
	{
		return false;
		
	}
}
