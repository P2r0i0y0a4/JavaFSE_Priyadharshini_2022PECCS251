@Configuration
public class RateLimiterConfig {
    @Bean
    public KeyResolver userKeyResolver() {
        return exchange -> Mono.just("global"); // Or extract user/IP for more granularity
    }
}
