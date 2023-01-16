FROM jenkins/jenkins:lts

FROM ruby:2.7
RUN gem install bundler
RUN gem install rake
RUN gem install rspec

USER root

RUN apt-get update && \
    apt-get install -y docker.io

RUN usermod -a -G docker dany

USER dany

RUN /usr/local/bin/install-plugins.sh docker-plugin


