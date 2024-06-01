package com.example.utils;

import java.io.File;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.PutObjectRequest;

public class UploadToS3 {

	public static void uploadToS3(File file, String fileName) {

		final String awsId = LerProperties.lerPropriedade("aws.s3.id");
		final String awsKey = LerProperties.lerPropriedade("aws.s3.key");
		final String REGION = LerProperties.lerPropriedade("aws.s3.region");
		final String BUCKET_NAME = LerProperties.lerPropriedade("aws.s3.bucket");
		
		BasicAWSCredentials awsCred = new BasicAWSCredentials(awsId, awsKey);

		AmazonS3 s3Client = AmazonS3ClientBuilder.standard()
				.withCredentials(new AWSStaticCredentialsProvider(awsCred))
				.withRegion(REGION)
				.build();

		s3Client.putObject(new PutObjectRequest(BUCKET_NAME, fileName, file));

		System.out.println("Arquivo uploaded para S3, bucket: " + BUCKET_NAME + ". Nome do arquivo: " + fileName);
	}
}
