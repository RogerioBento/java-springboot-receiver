package br.com.rest.receiver.core.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.springframework.context.annotation.Configuration;

import br.com.rest.receiver.core.util.AnnotationExclusionStrategy;
import br.com.rest.receiver.core.util.HibernateProxyTypeAdapter;

@Configuration
public class GsonConfig {
    
    public static Gson gsonStart(){
        return new GsonBuilder().setExclusionStrategies(new AnnotationExclusionStrategy())
                                .registerTypeAdapterFactory(HibernateProxyTypeAdapter.FACTORY)
                                .create();    
        }
}