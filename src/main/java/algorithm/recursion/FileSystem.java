package algorithm.recursion;

import java.util.ArrayList;
import java.util.List;

public class FileSystem {

    public static class Directory {

        String name;
        List<Directory> sub = new ArrayList<>();
        List<String> files = new ArrayList<>();

    }


    /**
     * Recursively search for files in a directory that match the query (either full filename or extension).
     *
     * @param directory obj directory
     * @param query     file name or extension
     * @return return file full path list. every single place that it was found
     */
    public List<String> searchFiles(Directory directory, String query) {

        final List<String> pathsList = new ArrayList<>();

        for (String fileName : directory.files) {

            String[] nameExt = fileName.split("\\.");

            if (query.equals(fileName) || query.substring(1).equals(nameExt[1]))
                pathsList.add(directory.name + "/" + fileName);
        }

        if (directory.sub.isEmpty())
            return pathsList;

        List<String> subPath = new ArrayList<>();
        for (Directory subdirectory : directory.sub) {
            subPath.addAll(searchFiles(subdirectory, query));
        }

        for (String path : subPath) {
            pathsList.add(directory.name + "/" + path);
        }

        return pathsList;
    }

}
