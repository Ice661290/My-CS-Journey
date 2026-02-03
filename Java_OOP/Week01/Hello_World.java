/** How to download,compile and run java in Editor:Notepad
 * 1. Go to Website:"Oracle" and download "JDK21 and Choose Window:"X64 Installer"" Download it.
 * 2. Check "java file" it must have "java icon" and "javac".
 * 3. Search "cmd" in Start and type "java -version"
 *  3.1. if it show "'java' is not recognized as an internal or external command,operable program or batch file" 
 *    the java that you download is wrong(Websites or method that download)
 *  3.2. Solution:
 *    3.2.1. Go to download java correct webiste
 *    3.2.2. If it show like 2.1. you must fix like this: 
 *      3.2.2) Search in Start:"Edit the system environment variables"
 *      3.2.3) Choose "advanced" and choose "Environment Variables(below)"
 *      3.2.4) Found "path"(that java address) and choose "Edit" and paste(the path that java address)
 *             after the ; (if you delete in front of ; it will delete  some importance file)
 *      3.2.5) Create "classpath(upper)" choose "New":
 *             Variable name: classpath
 *             Variable value: .
 *  4. Type "cd\" press "Enter".
 *  5. Type "cd (Folder name that you need to compile & run)" press "Enter".
 *  6. Type "javac (File name that you need to compile)" press "Enter" we gonna get "file.class"
 *  7. Type "java (File name that have ".class" you need to run)" press "Enter" 
 *     and we got a file.java that mean it can run now.
 *  8. You can type "dir" that check folder that have file ".java , .class and tell 
 *     about how much bytes that it have.
 */


 // Editor:VScode - only download java and extension packages java in VScode


public class Hello_World{     //class name and file name must be the same.Don't forgot about case sensitive
    
    public static void main(String[] args){
        System.out.println("Hello World");
    }
}


