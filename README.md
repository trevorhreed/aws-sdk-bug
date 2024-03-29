After updating the aws-sdk to 2.25.20, I get the following error when attempting to create an `S3AsyncClient` using the `crtBuilder()`:

```
Exception in thread "main" java.lang.NoSuchMethodError: 'software.amazon.awssdk.crt.s3.S3ClientOptions software.amazon.awssdk.crt.s3.S3ClientOptions.withMultipartUploadThreshold(long)'
	at software.amazon.awssdk.services.s3.internal.crt.S3CrtAsyncHttpClient.createS3ClientOption(S3CrtAsyncHttpClient.java:102)
	at software.amazon.awssdk.services.s3.internal.crt.S3CrtAsyncHttpClient.<init>(S3CrtAsyncHttpClient.java:73)
	at software.amazon.awssdk.services.s3.internal.crt.S3CrtAsyncHttpClient.<init>(S3CrtAsyncHttpClient.java:64)
	at software.amazon.awssdk.services.s3.internal.crt.S3CrtAsyncHttpClient$Builder.build(S3CrtAsyncHttpClient.java:264)
	at software.amazon.awssdk.services.s3.internal.crt.S3CrtAsyncHttpClient$Builder.buildWithDefaults(S3CrtAsyncHttpClient.java:270)
	at software.amazon.awssdk.core.client.builder.SdkDefaultClientBuilder.lambda$resolveAsyncHttpClient$15(SdkDefaultClientBuilder.java:413)
	at java.base/java.util.Optional.map(Optional.java:260)
	at software.amazon.awssdk.utils.Either.lambda$map$0(Either.java:51)
	at java.base/java.util.Optional.orElseGet(Optional.java:364)
	at software.amazon.awssdk.utils.Either.map(Either.java:51)
	at software.amazon.awssdk.core.client.builder.SdkDefaultClientBuilder.lambda$resolveAsyncHttpClient$16(SdkDefaultClientBuilder.java:413)
	at java.base/java.util.Optional.map(Optional.java:260)
	at software.amazon.awssdk.core.client.builder.SdkDefaultClientBuilder.resolveAsyncHttpClient(SdkDefaultClientBuilder.java:413)
	at software.amazon.awssdk.core.client.builder.SdkDefaultClientBuilder.lambda$finalizeAsyncConfiguration$3(SdkDefaultClientBuilder.java:296)
	at software.amazon.awssdk.utils.AttributeMap$DerivedValue.primeCache(AttributeMap.java:600)
	at software.amazon.awssdk.utils.AttributeMap$DerivedValue.get(AttributeMap.java:589)
	at software.amazon.awssdk.utils.AttributeMap$Builder.resolveValue(AttributeMap.java:396)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at software.amazon.awssdk.utils.AttributeMap$Builder.build(AttributeMap.java:362)
	at software.amazon.awssdk.core.client.config.SdkClientConfiguration$Builder.build(SdkClientConfiguration.java:232)
	at software.amazon.awssdk.core.client.builder.SdkDefaultClientBuilder.finalizeAsyncConfiguration(SdkDefaultClientBuilder.java:298)
	at software.amazon.awssdk.core.client.builder.SdkDefaultClientBuilder.asyncClientConfiguration(SdkDefaultClientBuilder.java:220)
	at software.amazon.awssdk.services.s3.DefaultS3AsyncClientBuilder.buildClient(DefaultS3AsyncClientBuilder.java:51)
	at software.amazon.awssdk.services.s3.DefaultS3AsyncClientBuilder.buildClient(DefaultS3AsyncClientBuilder.java:27)
	at software.amazon.awssdk.core.client.builder.SdkDefaultClientBuilder.build(SdkDefaultClientBuilder.java:155)
	at software.amazon.awssdk.services.s3.internal.crt.DefaultS3CrtAsyncClient.initializeS3AsyncClient(DefaultS3CrtAsyncClient.java:149)
	at software.amazon.awssdk.services.s3.internal.crt.DefaultS3CrtAsyncClient.<init>(DefaultS3CrtAsyncClient.java:83)
	at software.amazon.awssdk.services.s3.internal.crt.DefaultS3CrtAsyncClient.<init>(DefaultS3CrtAsyncClient.java:77)
	at software.amazon.awssdk.services.s3.internal.crt.DefaultS3CrtAsyncClient$DefaultS3CrtClientBuilder.build(DefaultS3CrtAsyncClient.java:313)
	at software.amazon.awssdk.services.s3.internal.crt.DefaultS3CrtAsyncClient$DefaultS3CrtClientBuilder.build(DefaultS3CrtAsyncClient.java:184)
	at AwsExample.main(AwsExample.java:15)

Process finished with exit code 1
```
