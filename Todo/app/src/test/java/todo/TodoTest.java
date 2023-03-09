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

  @Test 
  public void returnsEntireListOfItems() {
    Todo todo = new Todo();

    ArrayList<String> todoList = new ArrayList<String>();

    todoList.add("cook dinner");
    todoList.add("clean the dishes");
    todoList.add("wash the car");

    todo.addTask("cook dinner");
    todo.addTask("clean the dishes");
    todo.addTask("wash the car");

    assertEquals("Should return all added task", todoList, todo.getTasks());
  }
}
