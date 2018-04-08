package couponandfeedbackdatabaseservice.couponfeedback;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.anything;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Collections;
import java.util.List;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import org.assertj.core.util.Arrays;
import org.bson.Document;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;

import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.databind.ObjectMapper;

import com.project.os.controller.CouponAndFeedbackController;
import com.project.os.database.CouponAndFeedbackRepository;
import com.project.os.model.CouponAndFeedback;
@RunWith(SpringRunner.class)
@WebMvcTest
public class CouponFeedbackControllerTest {
   @Autowired
   MockMvc mockMvc;
   
   @MockBean
   CouponAndFeedbackRepository userRepository;
   
   @Test
   public void contextLoads() throws Exception {
       
       Mockito.when(userRepository.findByofferId(null)).thenReturn(Document.parse(null));
       
       MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/getfeedback/23")
               .accept(MediaType.APPLICATION_JSON)).andReturn();
       
       System.out.println(mvcResult.getResponse());
       
       Mockito.verify(userRepository.findByofferId(null));
   }
}
/*@RunWith(SpringJUnit4ClassRunner.class)
public class CouponFeedbackControllerTest {

	@Autowired
    private MockMvc mockMvc;

   
    @InjectMocks
    private CouponAndFeedbackController coupon;

    @Before
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(coupon)
                .build();
    }

    @Test
    public void testHelloWorld() throws Exception {
        mockMvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string("hello"));

        verify(helloService).hello();
    }

    @Test
    public void testHelloWorldJson() throws Exception {
        mockMvc.perform(get("/getfeedback/23")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.title", Matchers.is("Greetings")))
                .andExpect(jsonPath("$.value", Matchers.is("Hello World")))
                .andExpect(jsonPath("$.*", Matchers.hasSize(6)));
    }
}

@RunWith(SpringRunner.class)
@SpringBootTest
@WebMvcTest(value = CouponAndFeedbackController.class)
public class CouponFeedbackControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@MockBean      
	private WebApplicationContext wac;
	
	
	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
		
	}
	
	@Test
	public void verifyFeedback() throws Exception {	this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
		mockMvc.perform(MockMvcRequestBuilders.get("/getfeedback/offer-101").accept(MediaType.APPLICATION_JSON))
		.andExpect(jsonPath("$.couponId").exists())
		.andExpect(jsonPath("$.userId").exists())
		.andExpect(jsonPath("$.offerId").exists())
		.andExpect(jsonPath("$.rating").exists())
		.andExpect(jsonPath("$.feedback").exists())
		.andExpect(jsonPath("$.couponId").value("coup-101"))
		.andExpect(jsonPath("$.userId").value("user-101"))
		.andExpect(jsonPath("$.offerId").value("offer-101"))
		.andExpect(jsonPath("$.rating").value(4))
		.andExpect(jsonPath("$.feedback").value("feedback-101"))
		.andDo(print());
		
		
	}
	
}
*/