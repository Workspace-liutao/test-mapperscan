package mapperscan.service.Impl;

import mapperscan.service.ProductsService;
import org.springframework.stereotype.Component;

@Component
public class WatchProductImpl implements ProductsService {
    @Override
    public void createProduct() {
        System.out.println("生产电视机");
    }

    @Override
    public void createProduct1() {
        System.out.println("生产电视机11111");
    }
}
