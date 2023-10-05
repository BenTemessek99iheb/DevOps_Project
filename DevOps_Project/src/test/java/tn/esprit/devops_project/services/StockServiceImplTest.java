package tn.esprit.devops_project.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.devops_project.entities.Stock;
import tn.esprit.devops_project.repositories.StockRepository;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class StockServiceImplTest {
  @Autowired
    StockRepository stockRepository;
    //etaps : 1/create a pachage under main with the same name of the artifact in our case tn.esprit.devops_project
    //2/ go to the service u wanna test , select the name of service and click ctrl+shift+t , it will ask u what methods u wanna test , select the method

    @Test
    void addStock() {
        // Given
        Stock stock = new Stock();
        stock.setTitle("Test Stock");

        // When
        Stock savedStock = stockRepository.save(stock);

        // Then
        assertNotNull(savedStock);
        assertNotNull(savedStock.getIdStock());
        assertEquals("Test Stock", savedStock.getTitle());
    }
}