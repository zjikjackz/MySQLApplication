package com.example.zjikojackz.mysqlapplication;

import java.io.Serializable;

/**
 * Created by zJIKoJACKz on 10/2/2560.
 */

public class TodoList implements Serializable {

    public int taskid;
    public String taskname;

    public int getTaskid() {
        return taskid;
    }

    public void setTaskid(int taskid) {
        this.taskid = taskid;
    }

    public String getTaskname() {
        return taskname;
    }

    public void setTaskname(String taskname) {
        this.taskname = taskname;
    }
}
