package lesson09_interface;

public interface Fax {
	String FAX_NUMBER = "02-1234-5678";
	void send(String msg);
	void receive(String msg);
}
