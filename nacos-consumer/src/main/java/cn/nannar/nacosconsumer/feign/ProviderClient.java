package cn.nannar.nacosconsumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ：panshanwen
 * @description ：远程调用
 * @date ：Created in 2019/10/25 19:08
 */
@FeignClient("nacos-provider")
public interface ProviderClient {
    @GetMapping("/hi")
    String hi(@RequestParam(value = "name", defaultValue = "forezp", required = false) String name);
}
