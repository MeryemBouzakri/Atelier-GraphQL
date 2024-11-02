package ma.xproce.inventoryservice;

import ma.xproce.inventoryservice.entities.Creator;
import ma.xproce.inventoryservice.entities.Video;
import ma.xproce.inventoryservice.repositories.CreatorRepository;
import ma.xproce.inventoryservice.repositories.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CreatorRepository creatorRepository, VideoRepository videoRepository) {
        return args -> {

            List<Creator> creators = List.of(Creator.builder().name("Meryem").email("Meryem@bouzakri.com").build(), Creator.builder().name("Adnane").email("Adnane@bakkou.ma").build());
            creatorRepository.saveAll(creators);
            List<Video> videos = List.of(
                    Video.builder().name("x").url("bouzakri.com").description("test1").creator(creators.get(0)).build(),

                    Video.builder().name("Wissal").url("elakebi.com").description("Test").creator(creators.get(1)).build());
            videoRepository.saveAll(videos);
        };
    }

}
