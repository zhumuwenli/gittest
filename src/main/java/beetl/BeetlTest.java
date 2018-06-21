package beetl;

import java.io.StringWriter;

import org.beetl.core.GroupTemplate;
import org.beetl.core.Template;

public class BeetlTest {
    
    public static void main(String[] args) {
        
        
        GroupTemplate gt = new GroupTemplate();
        Template t = gt.getTemplate("/template/hello.btl");
        t.binding("name", "beetl");
        StringWriter sw = new StringWriter();
        t.renderTo(sw);
        System.out.println(sw.getBuffer().toString());
        
        
    }

}
