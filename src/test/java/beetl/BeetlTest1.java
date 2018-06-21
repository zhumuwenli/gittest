package beetl;

import org.beetl.core.Configuration;
import org.beetl.core.GroupTemplate;
import org.beetl.core.Template;
import org.beetl.core.resource.ClasspathResourceLoader;
import org.beetl.core.resource.FileResourceLoader;
import org.beetl.core.resource.StringTemplateResourceLoader;
import org.junit.Test;

public class BeetlTest1 {

    /**
     * 加载classpath下的资源
     * 
     * @throws Exception
     */
    @Test
    public void classpathRL() throws Exception {
        ClasspathResourceLoader resourceLoader = new ClasspathResourceLoader();
        Configuration cfg = Configuration.defaultConfiguration();
        GroupTemplate gt = new GroupTemplate(resourceLoader, cfg);
        Template t = gt.getTemplate("/template/hello.btl");
        t.binding("name", "beetl");
        String str = t.render();
        System.out.println(str);
    }

    /**
     * 加载文件系统下的资源
     * 
     * @throws Exception
     */
    @Test
    public void filePathRL() throws Exception {
        String root = "C:/_programs/_program/workspaces/myEclipseWorkspace/gittest/src/main/resources/template/";
        FileResourceLoader resourceLoader = new FileResourceLoader(root, "utf-8");
        Configuration cfg = Configuration.defaultConfiguration();
        GroupTemplate gt = new GroupTemplate(resourceLoader, cfg);
        Template t = gt.getTemplate("hello.btl");
        t.binding("name", "beetl");
        String str = t.render();
        System.out.println(str);
    }

    /**
     * 直接构建字符串
     * 
     * @throws Exception
     */
    @Test
    public void stringBeetl() throws Exception {
        StringTemplateResourceLoader resourceLoader = new StringTemplateResourceLoader();
        Configuration cfg = Configuration.defaultConfiguration();
        GroupTemplate gt = new GroupTemplate(resourceLoader, cfg);
        Template t = gt.getTemplate("hello,${name} \r\n你好：${name}");
        t.binding("name", "beetl");
        String str = t.render();
        System.out.println(str);
    }
    
    @Test
    public void test() {
        System.out.println("test");
    }

}
