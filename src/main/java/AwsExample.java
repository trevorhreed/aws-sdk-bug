import software.amazon.awssdk.auth.credentials.DefaultCredentialsProvider;
import software.amazon.awssdk.services.s3.S3AsyncClient;
import software.amazon.awssdk.services.s3.model.GetObjectRequest;

import java.nio.file.Paths;

import static software.amazon.awssdk.regions.Region.US_EAST_1;

public class AwsExample {
  public static void main(String[] args) {
    var credentials = DefaultCredentialsProvider.create();
    try (var s3Client = S3AsyncClient.crtBuilder()
        .credentialsProvider(credentials)
        .region(US_EAST_1)
        .build()) {
      var s3Object = s3Client.getObject(GetObjectRequest.builder()
              .bucket("test-bucket")
              .key("test-key")
              .build(),
          Paths.get("path"));
      System.out.println("We did it: " + s3Object.get().toString());
    }
    catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
