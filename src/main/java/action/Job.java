/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

public class Job {
     private String id,title;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Job(String id, String title) {
        this.id = id;
        this.title = title;
    }

    public Job() {
    }
    
}
