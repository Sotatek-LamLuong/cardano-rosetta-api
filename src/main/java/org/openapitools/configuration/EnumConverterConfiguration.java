package org.openapitools.configuration;

import org.openapitools.model.BlockEventType;
import org.openapitools.model.CoinAction;
import org.openapitools.model.CurveType;
import org.openapitools.model.Direction;
import org.openapitools.model.ExemptionType;
import org.openapitools.model.Operator;
import org.openapitools.model.SignatureType;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;

@Configuration
public class EnumConverterConfiguration {

    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.blockEventTypeConverter")
    Converter<String, BlockEventType> blockEventTypeConverter() {
        return new Converter<String, BlockEventType>() {
            @Override
            public BlockEventType convert(String source) {
                return BlockEventType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.coinActionConverter")
    Converter<String, CoinAction> coinActionConverter() {
        return new Converter<String, CoinAction>() {
            @Override
            public CoinAction convert(String source) {
                return CoinAction.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.curveTypeConverter")
    Converter<String, CurveType> curveTypeConverter() {
        return new Converter<String, CurveType>() {
            @Override
            public CurveType convert(String source) {
                return CurveType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.directionConverter")
    Converter<String, Direction> directionConverter() {
        return new Converter<String, Direction>() {
            @Override
            public Direction convert(String source) {
                return Direction.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.exemptionTypeConverter")
    Converter<String, ExemptionType> exemptionTypeConverter() {
        return new Converter<String, ExemptionType>() {
            @Override
            public ExemptionType convert(String source) {
                return ExemptionType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.operatorConverter")
    Converter<String, Operator> operatorConverter() {
        return new Converter<String, Operator>() {
            @Override
            public Operator convert(String source) {
                return Operator.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.signatureTypeConverter")
    Converter<String, SignatureType> signatureTypeConverter() {
        return new Converter<String, SignatureType>() {
            @Override
            public SignatureType convert(String source) {
                return SignatureType.fromValue(source);
            }
        };
    }

}
