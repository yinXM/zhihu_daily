package org.what.word.test;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;
import org.what.word.api.HttpFormat;
import org.what.word.api.HttpFormatToModel;
import org.what.word.api.HttpTest;
import org.what.word.model.LatestModel;
import org.what.word.model.stories;
import org.what.word.model.top_stories;

import java.io.File;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FreemarkTest {
    public static void main(String[] args) {
        try{
            Configuration cfg = new Configuration(Configuration.VERSION_2_3_29);
            cfg.setDirectoryForTemplateLoading(new File("src/main/resources"));
            cfg.setDefaultEncoding("utf-8");
            cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
            cfg.setLogTemplateExceptions(false);
            cfg.setWrapUncheckedExceptions(true);
            cfg.setFallbackOnNullLoopVariable(false);

//            HttpFormat format = new HttpFormat();
//            Map map  = (Map) format.HttpTest();
            HttpFormatToModel format = new HttpFormatToModel();
            LatestModel model = (LatestModel) format.HttpTest();
            String date = model.getDate();
            List<stories> stories = model.getStories();
            List<top_stories> top_stories = model.getTop_stories();

            Map root = new HashMap();
            root.put("user","what");
            root.put("stories",stories);
            root.put("date",date);
            Template temp = cfg.getTemplate("test1.ftlh");
//            Writer out = new OutputStreamWriter(System.out);
            Writer out  =  new FileWriter(new File("src/main/resources/output.html"));
            temp.process(root, out);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
