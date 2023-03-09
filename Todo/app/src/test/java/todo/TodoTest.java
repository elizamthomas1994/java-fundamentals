package todo;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;

public class TodoTest {
  @Test 
  public void beginsWithEmptyList() {
    Todo todo = new Todo();
    assertTrue("initial todo list is empty", todo.todos.isEmpty());
  }

  @Test 
  public void addsItemToList() {
    Todo todo = new Todo();

    ArrayList<String> todoList = new ArrayList<String>();
    todoList.add("cook dinner");
    assertEquals("Should return new added task", todoList, todo.addTask("cook dinner"));
  }
}
