#!/bin/bash

CURRENT_TAG=$(git tag --points-at HEAD | sort -V | tail -n1)
if [[ -z "$CURRENT_TAG" ]]; then
  echo "Commit is not tagged! Untagged commits may not be cut for release."
  exit 1
fi

git checkout -b release/$CURRENT_TAG
git push origin release/$CURRENT_TAG

