package lk.ac.mrt.comment;

import lk.ac.mrt.network.Entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chamika on 1/19/17.
 */
public class Posts extends Entity implements Viewable {

    private List<File> fileList;
    private long timestamp;

    public Posts(Posts anotherPost){
        if(anotherPost!= null && anotherPost.getFileList()!=null){
            this.fileList = new ArrayList<File>(anotherPost.getFileList());
        }else{
            fileList = new ArrayList<File>();
        }

    }

    public Posts(){
        fileList = new ArrayList<File>();
        timestamp = 0;
    }

    @Override
    public String marshall() {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public void unmarshall(String messsageData) {
        throw new RuntimeException("Not implemented");
    }

    public List<File> getFileList() {
        if (fileList == null) {
            fileList = new ArrayList<File>();
        }
        return fileList;
    }

    public void setFileList(List<File> fileList) {
        this.fileList = fileList;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public void addFile(File file) {
        getFileList().add(file);
    }

    public void removeFile(File file) {
        getFileList().remove(file);
    }

    public String viewPosts() {
        return generateView();
    }

    @Override
    public String generateView() {
        StringBuilder sb = new StringBuilder();
        List<File> fileList = getFileList();
        for (File file : fileList) {
            sb.append(file.generateView());
            sb.append(NEW_LINE);
            sb.append("-----------------------------");
            sb.append(NEW_LINE);
        }
        return sb.toString();
    }
}
