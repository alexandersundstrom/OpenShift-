# This is a repo to test a deployment of a rest api using Docker and OpenShift.

## How to install in OS

When adding a new project, make sure to selet "From Git". Using this repo, it will detect that it is a Java repo and preselect a Java Builder Image, with support for maven.

## How to add a git hook

Follow this [guide](https://docs.openshift.com/container-platform/3.6/dev_guide/builds/triggering_builds.html) to configure git so that Openshift will build automatically and deploy when you push to the git repo.

## OpenShift Sandbox
To test Openshift there is a [sandbox](https://developers.redhat.com/developer-sandbox) available online.