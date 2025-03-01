package dao;

public interface ToDoDAO {
	public int register(Register reg);
	public int login(String email, String pass);
	public int addTask(Task task, int regid);
	public List<Task> findAllTasksByRegid(int regid);
	public boolean markTaskCompleted(int taskid, int regid);
	public String getFnameByRegId(int regId);

}
