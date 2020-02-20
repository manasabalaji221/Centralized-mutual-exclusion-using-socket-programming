package project2;

/**
 *
 * @author manas
 */



        public class RawHttp{
    public String parseRequest(String s){
        String t;
                          t="(\"At server: Client \"\"by client\"+\"POST /path/script.cgi HTTP/1.0\\r\\n\" + \n" +"Message: "+s+
"            		\"\\r\\n\" + \n" +
"            		\"User-Agent: HTTPTool/1.0\\r\\n\" + \n" +
"            		\"Content-Type: application/x-www-form-urlencoded\\r\\n\" + \n" +
"            		\"Content-Length: 32\\r\\n\" + \n" +
"            		\"\\r\\n\" + \n" +
"            		\"home=home\");";
                          return t;
    }
    public String sendTime(Long total){
        String t;
                          t="(\"At server: Client \"\"by client\"+\"POST /path/script.cgi HTTP/1.0\\r\\n\" + \n" +"Total time taken by server to respond : "+total+ 
"            		\"\\r\\n\" + \n" +
"            		\"User-Agent: HTTPTool/1.0\\r\\n\" + \n" +
"            		\"Content-Type: application/x-www-form-urlencoded\\r\\n\" + \n" +
"            		\"Content-Length: 32\\r\\n\" + \n" +
"            		\"\\r\\n\" + \n" +
"            		\"home=home\");";
                          return t;
    }
}

