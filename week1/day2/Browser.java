package week1.day2;

public class Browser {
	float browserVersion;
	public void launchBrowserChrome() {
		System.out.println("Chrome Launched Successfully");
	}
	public void launchBrowserEdge() {
		System.out.println("Edge Launched Successfully");
	}
	public void loadURLChrome() {
		System.out.println("Chomre URL Loaded Successfully");
	}
	public void loadURLEdge() {
		System.out.println("Edge URL Loaded Successfully");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser chrome = new Browser();
		Browser edge = new Browser();
		chrome.browserVersion = 8.8F;
		edge.browserVersion = 9.9F;
		
		System.out.println("Chrome Browser "+chrome.browserVersion);
		chrome.launchBrowserChrome();
		chrome.loadURLChrome();
		System.out.println();
		System.out.println("Edge Browser "+edge.browserVersion);
		edge.launchBrowserEdge();
		edge.loadURLEdge();
	}

}
