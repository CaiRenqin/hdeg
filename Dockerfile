ARG JDK_VERSION=17.0.15_6
ARG BASE_IMG_PREFIX=
FROM ${BASE_IMG_PREFIX}eclipse-temurin:${JDK_VERSION}-jdk

## Create a none-root user
ARG USERNAME=appuser
ARG USER_UID=1001
ARG USER_GID=$USER_UID

RUN groupadd --gid $USER_GID $USERNAME \
    && useradd -ms /usr/bin/nologin --uid $USER_UID --gid $USER_GID -m $USERNAME

##
RUN mkdir -p /workspace/conf /workspace/logs /workspace/tmp && chown -R ${USER_UID}:${USER_GID} /workspace

# USER $USERNAME
ARG BOOT_JAR_DIR=./eg-web/build/libs
ADD ${BOOT_JAR_DIR}/*-boot.jar /workspace/app.jar
ADD docker/app.conf /workspace/conf/

RUN chmod 500 /workspace/app.jar && \
    chmod 400 /workspace/conf/app.conf && \
    chown -R ${USER_UID}:${USER_GID} /workspace

ENV APP_RUN_ROOT_DIR=/workspace CONF_FOLDER=/workspace/conf APP_LOG_DIR=/workspace/logs
# RUN chattr +i /workspace/app.jar

USER $USERNAME
WORKDIR /workspace

VOLUME ["/workspace/logs", "/workspace/tmp", "/workspace/conf"]
EXPOSE 8080
EXPOSE 8081
EXPOSE 8787

CMD ["./app.jar"]

