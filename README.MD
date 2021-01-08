# This is a repo to test a deployment of a rest api using Docker and OpenShift.

## How to install in OS

When adding a new project, make sure to selet "From Git". Using this repo, it will detect that it is a Java repo and preselect a Java Builder Image, with support for maven.

## How to add a git hook

Follow this [guide](https://docs.openshift.com/container-platform/3.6/dev_guide/builds/triggering_builds.html) to configure git so that Openshift will build automatically and deploy when you push to the git repo.

## OpenShift Sandbox
To test Openshift there is a [sandbox](https://developers.redhat.com/developer-sandbox) available online.

## dockerfile
The dockerfile in this repo is not used when building from Git, but can be used if you instead select to build from a dockerfile.

## Unit tests

OpenShift can be configured to run Uni tests before deploying the new image, documentation can be found [here](https://www.openshift.com/blog/maven-multi-module-projects-and-openshift).

The solution that I implented included updating the YAML file for the OpenShift Build, under the section `sourceStrategy` and `env`
with the following name and value:
``` 
- name: MAVEN_ARGS
  value: clean package
```

This was according to the documentation mentioned that states: 

> "If you need more control over the build behaviour at this level, you can use the MAVEN_ARGS environment variable instead, as this will effectively overwrite the default build command."

## Health Checks

OpenShift has support for healt checks. Go to `Topology` and open the `Details`of the Deployed application. At the top 
right there is a dropdown with `Actions`, select `Edit Health Checks`. I've tried adding a `Readiness Probe` which worked 
perfectly fine.