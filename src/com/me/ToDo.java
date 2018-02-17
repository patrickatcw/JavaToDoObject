package com.me;

public class ToDo {

    //fields
    public int wake;
    public String next;
    public String work;
    public String lunch;

    //constructors w/parameters
    public ToDo(int wake, String next, String work, String lunch) {

        this.wake = wake;
        this.next = next;
        this.work = work;
        this.lunch = lunch;

    }

    //getter methods for this. fields
    public int getWake() {
        return this.wake;
    }

    public String getNext() {
        return this.next;
    }

    public String getWork() {
        return this.work;
    }

    public String getLunch() {
        return this.lunch;
    }
}
