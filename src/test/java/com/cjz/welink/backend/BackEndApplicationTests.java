package com.cjz.welink.backend;

import com.cjz.welink.backend.dao.NeteaseMailEntityDao;
import com.cjz.welink.backend.dao.UserEntityDao;
import com.cjz.welink.backend.domain.*;
import com.cjz.welink.backend.service.*;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.client.ResponseErrorHandler;
import org.springframework.web.client.RestTemplate;

import javax.persistence.criteria.*;
import java.io.IOException;
import java.util.Date;

@SpringBootTest
class BackEndApplicationTests {

}





