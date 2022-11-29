package com.example.dividend;

import com.example.dividend.model.Company;
import com.example.dividend.model.ScrapedResult;
import com.example.dividend.scraper.YahooFinanceScraper;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class DividendApplication {

    public static void main(String[] args) {
//        SpringApplication.run(DividendApplication.class, args);

        YahooFinanceScraper scraper = new YahooFinanceScraper();
        ScrapedResult result = scraper.scrap(Company.builder().ticker("O").build());
        System.out.println(result);

    }
}
