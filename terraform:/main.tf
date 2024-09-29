provider "aws" {
  region = "us-east-1"
}

resource "aws_instance" "dating_simulator" {
  ami           = "ami-12345678"  # Use a valid AMI ID
  instance_type = "t2.micro"

  tags = {
    Name = "DatingSimulator"
  }

  user_data = <<-EOF
              #!/bin/bash
              yum update -y
              yum install java-1.8.0-openjdk-devel -y
              # Add commands to clone your repo and run the Java application
              EOF
}

resource "aws_security_group" "web_sg" {
  name        = "web_sg"
  description = "Allow HTTP and SSH traffic"

  ingress {
    from_port   = 22
    to_port     = 22
    protocol    = "tcp"
    cidr_blocks = ["0.0.0.0/0"]
  }

  ingress {
    from_port   = 80
    to_port     = 80
    protocol    = "tcp"
    cidr_blocks = ["0.0.0.0/0"]
  }
}
