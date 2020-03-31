package top.sunhaijie.gmall.pms;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.sunhaijie.gmall.pms.entity.Product;
import top.sunhaijie.gmall.pms.service.ProductService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GmallPmsApplicationTests {

    @Autowired
    ProductService productService;

    @Test
    public void contextLoads() {
        Product byId = productService.getById(1);
        System.out.println(byId.toString());
    }

}
