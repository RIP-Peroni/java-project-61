.DEFAULT_GOAL := build-run

clean:
	./gradlew clean

build:
	./gradlew installDist

lint:
	./gradlew checkstyleMain checkstyleTest

run:
	./gradlew run

run-dist:
	./build/install/app/bin/app

update-deps:
	./gradlew useLatestVersions

build-run: build run