package Abstraction;

interface Connection
{
	void commit();
	void rollback();
}
class Oracle implements Connection
{

	@Override
	public void commit() {
		System.out.println("Oracle Commit.........");// TODO Auto-generated method stub
		
	}

	@Override
	public void rollback() {
		// TODO Auto-generated method stub
		System.out.println("Oravle Rollback...........");
	}
	
}


class Mysql implements Connection
{

	@Override
	public void commit() {
		// TODO Auto-generated method stub
		System.out.println("MYSQL Commit............");
	}

	@Override
	public void rollback() {
		System.out.println("MYSQL Rollback.............");
		
		// TODO Auto-generated method stub
		
	}
	
}



public class Incapsulation {
public static void main(String[] args) {
	
	
//	Connection con=new Oracle();
//	
//	con.commit();
//	con.rollback();
//	
	
	
	
	Connection con=new Mysql();
	
	con.commit();
	con.rollback();
	
	
	
	
	
	
	
	
}
}
