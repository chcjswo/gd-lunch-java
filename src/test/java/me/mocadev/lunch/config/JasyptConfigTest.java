package me.mocadev.lunch.config;

import static org.assertj.core.api.Assertions.assertThat;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.junit.jupiter.api.Test;

/**
 * https://github.com/chcjswo
 * https://mocadev.tistory.com
 *
 * @author chcjswo
 * @date 2020-02-02
 */
class JasyptConfigTest {

    @Test
    void Jasypt_암호화_Test() {
        String value = "test";

        StandardPBEStringEncryptor pbeEnc = new StandardPBEStringEncryptor();
        pbeEnc.setAlgorithm("PBEWithMD5AndDES");
        pbeEnc.setPassword("1234"); // 암호화 키

        String enc = pbeEnc.encrypt(value); // 암호화 할 내용
        System.out.println("enc = " + enc); // 암호화 한 내용을 출력

        //테스트용 복호화
        String des = pbeEnc.decrypt(enc);
        System.out.println("des = " + des);

        assertThat(des).isEqualTo(value);
    }

}
