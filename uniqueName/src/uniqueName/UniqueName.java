package uniqueName;

import org.junit.Test;

public class UniqueName {
	
	public String getUniqueName ()
	{
		String userName = new String();
		CharSequence css = "1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int max = css.length();
		long unixTime = System.currentTimeMillis();
		System.out.println(unixTime);

		int index;
		
		do {
			index = (int)((long)unixTime % (long)max);
			userName = css.charAt(index) + userName;
			unixTime = unixTime / (long)max;
		} while (unixTime > max);
		
		return userName;
	}
	
	@Test
	public void GetName()
	{
		UniqueName userID = new UniqueName();
		
		System.out.println(userID.getUniqueName());
	}
}
