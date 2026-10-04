#!/usr/bin/env sh

#
# Copyright 2015 the original author or authors.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#      https://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#

##############################################################################
##
##  Gradle start up script for UN*X
##
##############################################################################

# Attempt to set APP_HOME
# Resolve links: $0 may be a link
PRG="$0"
# Need this for relative symlinks.
while [ -h "$PRG" ] ; do
    ls -di "$PRG" > /dev/null 2>&1
    result=$?
    if [ $result -eq 0 ]; then
        PRG=$( cd -P "$(dirname "$PRG")" >/dev/null 2>&1 && pwd )
    else
        PRG=$(readlink "$PRG")
    fi
done
# Use dirname to get directory, then cd there.
APP_HOME=$( cd "$(dirname "$PRG")" >/dev/null 2>&1 && pwd )

CLASSPATH=$APP_HOME/gradle/wrapper/gradle-wrapper.jar
JAVACMD=${JAVACMD:-`which java`}

if [ ! -x "$JAVACMD" ] ; then
    echo "Error: JAVA_HOME is not defined correctly." >&2
    echo "  We cannot execute java" >&2
    exit 1
fi

if [ -z "$JAVA_HOME" ] ; then
    echo "Warning: JAVA_HOME environment variable is not set."
fi

exec "$JAVACMD" -cp "$CLASSPATH" org.gradle.wrapper.GradleWrapperMain "$@"
