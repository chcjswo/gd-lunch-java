package me.mocadev.lunch.config;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import com.ulisesbocchio.jasyptspringboot.annotation.EncryptablePropertySource;
import org.jasypt.encryption.StringEncryptor;
import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * https://github.com/chcjswo
 * https://mocadev.tistory.com
 *
 * @author chcjswo
 * @date 2020-02-02
 */
@Configuration
@EnableEncryptableProperties
@EncryptablePropertySource(name = "EncryptedProperties", value = "classpath:application.yml")
public class JasyptConfig {

        @Bean("jasyptStringEncryptor")
        public StringEncryptor stringEncryptor() {
            PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
            SimpleStringPBEConfig config = new SimpleStringPBEConfig();
            config.setPassword("gd_lunch"); //암호화에 사용할 키 -> 중요
            config.setAlgorithm("PBEWithMD5AndDES"); //사용할 알고리즘
            config.setKeyObtentionIterations("1000");
            config.setPoolSize("1");
            config.setProviderName("SunJCE");
            config.setSaltGeneratorClassName("org.jasypt.salt.RandomSaltGenerator");
            config.setStringOutputType("base64");
            encryptor.setConfig(config);
            return encryptor;
        }

}
