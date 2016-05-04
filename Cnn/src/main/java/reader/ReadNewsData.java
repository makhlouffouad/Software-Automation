package reader;

import util.DataReader;

import java.io.IOException;
import java.util.List;

/**
 * Created by dell on 5/1/2016.
 */
public class ReadNewsData {

    DataReader dataReader = new DataReader();

    public String[] getData()throws IOException {
        String path = System.getProperty("user.dir")+"\\data\\searchData.xls";
        String [] news = dataReader.fileReader(path);
        return news;
    }
}
