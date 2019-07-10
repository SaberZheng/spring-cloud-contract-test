package  com.ecut.test;

import com.ecut.test.controllers.AuthorController;
import com.ecut.test.entities.Author;
import com.ecut.test.repositories.AuthorRepository;
import com.jayway.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AbstractContractTest {

    @Autowired
    private AuthorController authorController;
    @MockBean
    private AuthorRepository authorRepository;

    @Before
    public void before() {
        Mockito.when(authorRepository.list()).thenReturn(
                Arrays.asList(new Author(1, "sam","zheng",false), new Author(2, "andy","tang",false)));
        RestAssuredMockMvc.standaloneSetup(this.authorController);
    }

}
