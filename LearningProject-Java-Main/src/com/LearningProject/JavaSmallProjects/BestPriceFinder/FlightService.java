package com.LearningProject.JavaSmallProjects.BestPriceFinder;

import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class FlightService {
    public Stream<CompletableFuture<Quote>> getQuotes() {
        var sites = List.of("site1", "site2", "site3");

        var quotes =  sites.stream()
                .map(this::getQuote);

        return quotes;
    }


    public CompletableFuture<Quote> getQuote(String site) {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("getting quote of " + site );

            var random = new Random();
            var price = 100 + random.nextInt(10);

            try {
                Thread.sleep(random.nextInt(100, 1000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            return new Quote(site, price);
        });
    }

}
